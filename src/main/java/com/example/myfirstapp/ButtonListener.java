package com.example.myfirstapp;

import android.util.Log;
import android.view.View;

public class ButtonListener implements View.OnClickListener{
    MainActivity mainActivity;
    ButtonListener(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }
    String temp="0";

    // Getting answer form t2 textfield :
    public String getAnswer(String s){
          Double result = StringCalculator.evaluateExpression(s);
        return " "+result;
    }

    // getLast charcter value for operator
    public boolean check(){
        if(temp.charAt(temp.length()-1)=='-'||temp.charAt(temp.length()-1)=='+'||temp.charAt(temp.length()-1)=='x'||temp.charAt(temp.length()-1)=='/'||temp.charAt(temp.length()-1)=='%'||temp.charAt(temp.length()-1)=='.')
        {     // not to do anything
            return true;
        }
        return false;
    }


    // creating a method to start Listen the field on every puss of button
    public  void listenfield() {
      //  Log.d("status", "started");
        if(!check()) {
            mainActivity.t1.setText(getAnswer(temp));
        }
    }


    @Override
    public void onClick(View view) {

      if(view.getId()==R.id.ac){
          mainActivity.t1.setText("0");
          mainActivity.t2.setText("0");
          temp=" ";
      }
      if(view.getId()==R.id.clear){
         String s = mainActivity.t2.getText().toString();
          temp=s.substring(0,s.length()-1);
          if(s.length()==0){
              mainActivity.t2.setText("0");
          }
          mainActivity.t2.setText(temp);
          listenfield();
      }
      if(view.getId()==R.id.ans){
         String ans= temp=(String) mainActivity.t1.getText();
          mainActivity.t2.setText(ans);
          listenfield();
      }
        if(view.getId()==R.id.equal){
            String ans= temp=(String) mainActivity.t1.getText();
            mainActivity.t2.setText(ans);
            listenfield();
        }

        if(view.getId()==R.id.mod){
        String text1=(String)mainActivity.t1.getText();
        Double num1 = Double.parseDouble(text1);
        num1=num1/100;
        temp=" "+num1;
            mainActivity.t2.setText(temp);
            mainActivity.t1.setText(temp);
        }

     // if number button is pressed
       switch(view.getId()){

           case R.id.one: {
               if(temp.equals("0")){
                   temp ="1";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 1;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.two: {
               if(temp.equals("0")){
                   temp ="2";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 2;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.three: {
               if(temp.equals("0")){
                   temp ="3";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 3;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.four: {
               if(temp.equals("0")){
                   temp ="4";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 4;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.five: {
               if(temp.equals("0")){
                   temp ="5";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 5;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.six: {
               if(temp.equals("0")){
                   temp ="6";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 6;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.seven: {
               if(temp.equals("0")){
                   temp ="7";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 7;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.eight: {
               if(temp.equals("0")){
                   temp ="8";
                   mainActivity.t2.setText(temp);
                   break;
               }
               temp = temp + 8;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.nine: {
               if(temp.equals("0")){
                   temp ="9";
                   mainActivity.t2.setText(temp);
                 break;
               }
               temp = temp + 9;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.zero: {
               temp = temp + 0;
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.dot: {

               if(check())
               {     // not to do anything
                   break;
                    }
               temp = temp +".";
               mainActivity.t2.setText(temp);
               listenfield();
               break;
           }
           case R.id.add: {

               if(check())
               {     // not to do anything
                   break;
               }
               temp = temp +"+";
               mainActivity.t2.setText(temp);
               break;
           }
           case R.id.sub: {

               if(check())
               {     // not to do anything
                   break;
               }
               temp = temp +"-";
               mainActivity.t2.setText(temp);
               break;
           }
           case R.id.mul: {

               if(check())
               {     // not to do anything
                   break;
               }
               temp = temp +"*";
               mainActivity.t2.setText(temp);
               break;
           }
           case R.id.div: {

               if(check())
               {     // not to do anything
                   break;
               }
               temp = temp +"/";
               mainActivity.t2.setText(temp);
               break;
           }


       }

    }
}
