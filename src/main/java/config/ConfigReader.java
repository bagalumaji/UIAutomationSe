package config;

import org.aeonbits.owner.ConfigCache;
import propertyreader.FrameworkConfig;

public final class ConfigReader {
    private ConfigReader(){}

    public static FrameworkConfig getConfigReader(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
