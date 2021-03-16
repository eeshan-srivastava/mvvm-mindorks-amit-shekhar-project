package com.mindorks.framework.mvvm.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import com.mindorks.framework.mvvm.R;

import java.util.ArrayList;

public class QuizInfo {

    public static boolean option_selected=false;

    public static int question_no=1;
    @SuppressLint("StaticFieldLeak")
    public static Context context;

    public static int current_question_state=-1;

    public static ArrayList<Integer> quiz_state=new ArrayList<>();

    private static int temp;

    public static void loadQuizInitialState(){
        quiz_state.add(-1);
        quiz_state.add(-1);
        quiz_state.add(-1);
        quiz_state.add(-1);
        quiz_state.add(-1);
        quiz_state.add(-1);
    }

   public static void resolveQuestionState(boolean choice){
        if(choice){
            colorCodeQuestions(question_no);
        }else{
            temp=current_question_state;
            for(int i=1;i<=6;i++){
                current_question_state=quiz_state.get(i-1);
                colorCodeQuestions(i);
            }
            current_question_state=temp;
        }
   }

   public static void colorCodeQuestions(int i){
       switch (i){
           case 1:
               TextView question_bubble_1 =((Activity) context).findViewById(R.id.question_1_bubble);
               if(current_question_state==-1) question_bubble_1.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_1.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_1.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
           case 2:
               TextView question_bubble_2 =((Activity) context).findViewById(R.id.question_2_bubble);
               if(current_question_state==-1) question_bubble_2.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_2.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_2.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
           case 3:
               TextView question_bubble_3 =((Activity) context).findViewById(R.id.question_3_bubble);
               if(current_question_state==-1) question_bubble_3.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_3.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_3.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
           case 4:
               TextView question_bubble_4 =((Activity) context).findViewById(R.id.question_4_bubble);
               if(current_question_state==-1) question_bubble_4.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_4.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_4.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
           case 5:
               TextView question_bubble_5 =((Activity) context).findViewById(R.id.question_5_bubble);
               if(current_question_state==-1) question_bubble_5.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_5.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_5.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
           case 6:
               TextView question_bubble_6 =((Activity) context).findViewById(R.id.question_6_bubble);
               if(current_question_state==-1) question_bubble_6.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_unanswered));
               else if(current_question_state==0) question_bubble_6.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_wrong));
               else if(current_question_state==1) question_bubble_6.setBackground(context.getResources().getDrawable(R.drawable.bg_question_bubble_correct));
               break;
       }

   }

}
