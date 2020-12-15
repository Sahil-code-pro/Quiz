package com.example.hope

object Constants {

    fun getQuestions() : ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "How many finals has Mahendra Singh Dhoni played in the IPL?",
            "5",
            "6",
            "7",
            "8",
            3
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Who is the worst actor in Bollywood?",
            "Salman Khan",
            "Varun Dhawan",
            "Abhishek Bachchan",
            "Bobby Deol",
            1
        )
        questionList.add(question2)


        val question3 = Question(
            3,
            "Most famous person",
            "Binod",
            "Taimur",
            "Rhea",
            "Arnab Goswami",
            1
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "Best Ceo in tech company",
            "Mark Zuckerberg",
            "Sundar Pichai",
            "Elon Musk",
            "All the above",
            4
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "Best web-series(India)",
            "Mirzapur",
            "Scared-Game",
            "Scam 1992",
            "None",
            3
        )
        questionList.add(question5)


        val question6 = Question(
            6,
            "Kapil Sharma's jokes famous because of",
            "his Racist joke",
            "poor flirting",
            "insulting others",
            "All the above",
            6
        )
        questionList.add(question6)


        val question7 = Question(
            7,
            "Which team has successfully defended its title in the IPL?",
            "CSK",
            "MI",
            "KKR",
            "RCB",
            1
        )
        questionList.add(question7)


        val question8 = Question(
            8,
            "Which is the best College in India.",
            "IIT Bombay",
            "IIT Delhi",
            "Karan Johar' college",
            "IIT Madras",
            3
        )
        questionList.add(question8)


        val question9 = Question(
            9,
            "Which city have the fastest Internet speed",
            "Bengaluru",
            "Jammu",
            "Chennai",
            "Hyderbad",
            2
        )
        questionList.add(question9)


        val question10= Question(
            10,
            "Which cricketer scored four hundreds in the 2016 IPL?",
            "Brendon McCullam",
            "Virat Kholi",
            "David Warner",
            "Suresh Raina",
            2
        )
        questionList.add(question10)

     return questionList


    }
}