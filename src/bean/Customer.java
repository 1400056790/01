package bean;

import java.util.Date;

public class Customer {
    private String id;  //无业务信息
    private String name;       //姓名
    private String customerType;//乘客类型
    private String phone;   //电话
    private String cardId;  //身份证号码
    private Date birthDate; //乘客出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
