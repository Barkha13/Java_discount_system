/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author barkhapatel
 */
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    

    public Customer(String name, boolean member, String memberType){
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMember(){
        return member;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }
    
    @Override
    public String toString(){
        return (" ** Customer ** " +
                "Name : " + name +
                " ,Member : " + member +
                " ,MemberType : " + memberType);
    }
}
