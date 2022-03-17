package testdata;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonTestData {

    @Column(index = 0,name = "name")
    private String name;

    @Column(index = 1,name = "email")
    private String email;

    @Column(index = 2,name = "password")
    private String password;

    @Column(index = 3,name = "day")
    private String day;

    @Column(index = 4,name = "month")
    private String month;

    @Column(index = 5,name = "year")
    private String year;

}
