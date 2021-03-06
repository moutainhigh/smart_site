package com.zty.smart_site.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
/*
STAFF    		员工信息表
id            			员工id
staff_name      		员工姓名
staff_age				年龄
staff_img				照片
staff_sex				性别
staff_nation			民族
staff_card				身份证号
staff_address			身份证地址
staff_province			所在省
staff_phone				手机号
sos_name				紧急联系人姓名
sos_ship				紧急联系人关系
sos_phone				紧急联系人电话
entry_time				入职时间
history_integral		历史积分
end_integral			剩余积分
section_id				标段id
station_id              站点id
sub_id			        部门id
worktype_id     		工种id
password				账号密码(手机端登录密码和考核系统登录密码)
picture					手机端头像
state					在职状态('0' 离职  '1'在职)
status					实名认证状态('0' 未认证  '1' 已认证)
type 				    员工类型
train					培训状态('0' 未培训  '1'培训)

section_name            标段名称
station_name            站点名称
sub_name                分包单位名称
worktype_name           工种名称
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Staff {
    private int id,staff_age,history_integral,end_integral,section_id,sub_id,worktype_id,station_id;
    private String staff_name,staff_img,staff_sex,staff_nation,staff_card,staff_address,staff_province,staff_phone,sos_name,sos_ship,sos_phone,entry_time,password,picture,state,status,type,train;
    private String section_name,station_name,sub_name,worktype_name;

    public Staff(){
        super();
    }

    public Staff(int id, int staff_age, int history_integral, int end_integral, int section_id, int sub_id, int worktype_id, int station_id, String staff_name, String staff_img, String staff_sex, String staff_nation, String staff_card, String staff_address, String staff_province, String staff_phone, String sos_name, String sos_ship, String sos_phone, String entry_time, String password, String picture, String state, String status, String type, String train, String section_name, String station_name, String sub_name, String worktype_name) {
        this.id = id;
        this.staff_age = staff_age;
        this.history_integral = history_integral;
        this.end_integral = end_integral;
        this.section_id = section_id;
        this.sub_id = sub_id;
        this.worktype_id = worktype_id;
        this.station_id = station_id;
        this.staff_name = staff_name;
        this.staff_img = staff_img;
        this.staff_sex = staff_sex;
        this.staff_nation = staff_nation;
        this.staff_card = staff_card;
        this.staff_address = staff_address;
        this.staff_province = staff_province;
        this.staff_phone = staff_phone;
        this.sos_name = sos_name;
        this.sos_ship = sos_ship;
        this.sos_phone = sos_phone;
        this.entry_time = entry_time;
        this.password = password;
        this.picture = picture;
        this.state = state;
        this.status = status;
        this.type = type;
        this.train = train;
        this.section_name = section_name;
        this.station_name = station_name;
        this.sub_name = sub_name;
        this.worktype_name = worktype_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaff_age() {
        return staff_age;
    }

    public void setStaff_age(int staff_age) {
        this.staff_age = staff_age;
    }

    public int getHistory_integral() {
        return history_integral;
    }

    public void setHistory_integral(int history_integral) {
        this.history_integral = history_integral;
    }

    public int getEnd_integral() {
        return end_integral;
    }

    public void setEnd_integral(int end_integral) {
        this.end_integral = end_integral;
    }

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public int getWorktype_id() {
        return worktype_id;
    }

    public void setWorktype_id(int worktype_id) {
        this.worktype_id = worktype_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getStaff_img() {
        return staff_img;
    }

    public void setStaff_img(String staff_img) {
        this.staff_img = staff_img;
    }

    public String getStaff_sex() {
        return staff_sex;
    }

    public void setStaff_sex(String staff_sex) {
        this.staff_sex = staff_sex;
    }

    public String getStaff_nation() {
        return staff_nation;
    }

    public void setStaff_nation(String staff_nation) {
        this.staff_nation = staff_nation;
    }

    public String getStaff_card() {
        return staff_card;
    }

    public void setStaff_card(String staff_card) {
        this.staff_card = staff_card;
    }

    public String getStaff_address() {
        return staff_address;
    }

    public void setStaff_address(String staff_address) {
        this.staff_address = staff_address;
    }

    public String getStaff_province() {
        return staff_province;
    }

    public void setStaff_province(String staff_province) {
        this.staff_province = staff_province;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    public void setStaff_phone(String staff_phone) {
        this.staff_phone = staff_phone;
    }

    public String getSos_name() {
        return sos_name;
    }

    public void setSos_name(String sos_name) {
        this.sos_name = sos_name;
    }

    public String getSos_ship() {
        return sos_ship;
    }

    public void setSos_ship(String sos_ship) {
        this.sos_ship = sos_ship;
    }

    public String getSos_phone() {
        return sos_phone;
    }

    public void setSos_phone(String sos_phone) {
        this.sos_phone = sos_phone;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getWorktype_name() {
        return worktype_name;
    }

    public void setWorktype_name(String worktype_name) {
        this.worktype_name = worktype_name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", staff_age=" + staff_age +
                ", history_integral=" + history_integral +
                ", end_integral=" + end_integral +
                ", section_id=" + section_id +
                ", sub_id=" + sub_id +
                ", worktype_id=" + worktype_id +
                ", station_id=" + station_id +
                ", staff_name='" + staff_name + '\'' +
                ", staff_img='" + staff_img + '\'' +
                ", staff_sex='" + staff_sex + '\'' +
                ", staff_nation='" + staff_nation + '\'' +
                ", staff_card='" + staff_card + '\'' +
                ", staff_address='" + staff_address + '\'' +
                ", staff_province='" + staff_province + '\'' +
                ", staff_phone='" + staff_phone + '\'' +
                ", sos_name='" + sos_name + '\'' +
                ", sos_ship='" + sos_ship + '\'' +
                ", sos_phone='" + sos_phone + '\'' +
                ", entry_time='" + entry_time + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", train='" + train + '\'' +
                ", section_name='" + section_name + '\'' +
                ", station_name='" + station_name + '\'' +
                ", sub_name='" + sub_name + '\'' +
                ", worktype_name='" + worktype_name + '\'' +
                '}';
    }
}
