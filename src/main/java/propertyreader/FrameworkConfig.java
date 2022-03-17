package propertyreader;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/configs/FrameworkConfig.properties"
})
public interface FrameworkConfig extends Config {
    String url();
    long explicitTimeout();
    long pageLoadTimeout();

    @DefaultValue("edge")
    String browser();

    @Key("userid")
    String userId();

    String password();

    @Key("username")
    String userName();

    String day();
    String month();
    String year();

    @Key("remoteurl")
    String remoteUrl();

}
