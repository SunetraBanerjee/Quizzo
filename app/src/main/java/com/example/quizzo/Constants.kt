package com.example.quizzo

object Constants {

    const val USER_NAME :String ="user name"
    const val TOTAL_QUESTIONS:String="total no. of questions"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionslist=ArrayList<Question>()

        //1
        val q1=Question(
            1,"What country does this flag belong to?",R.drawable.ic_flag_of_argentina,
            "Argentina","India","Nepal","Germany",1
        )
        questionslist.add(q1)

        //2
        val q2=Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,"India","Germany",
                    "Japan","Australia",4
        )
        questionslist.add(q2)

        //3
        val q3=Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,"India","Belgium",
            "Japan","Australia",2
        )
        questionslist.add(q3)

        //4
        val q4=Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,"Brazil","Germany",
            "Japan","Australia",1
        )
        questionslist.add(q4)

        //5
        val q5=Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,"India","Germany",
            "Japan","Denmark",4
        )
        questionslist.add(q5)

        //6
        val q6=Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,"India","Fiji",
            "Japan","Australia",2
        )
        questionslist.add(q6)

        //7
        val q7=Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,"India","Germany",
            "Japan","Australia",1
        )
        questionslist.add(q7)

        //8
        val q8=Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,"India","Germany",
            "Japan","Kuwait",4
        )
        questionslist.add(q8)

        //9
        val q9=Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,"India","Germany",
            "New Zealand","Australia",3
        )
        questionslist.add(q9)

        //10
        val q10=Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,"India","Germany",
            "Japan","Australia",2
        )
        questionslist.add(q10)
        return questionslist
    }
}