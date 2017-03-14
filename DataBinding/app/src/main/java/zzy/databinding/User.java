package zzy.databinding;

/**
 * Author: 张智远  PC:MZ
 * Time: 2017/3/14 10:15
 * Email: 826680069@qq.com
 * Instruction: please enter class instruction here
 */
public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }
}
