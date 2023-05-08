package bakareritesh1729atgmail.com.myapplication

object constants {

    const val userName: String = "USER_NAME"
    const val correctAns : String = "CORRECT_ANS"
    const val totalQue : String = "TOTAL_QUESTION"

    fun qetQuestion(): ArrayList<Question> {

        val getQuestion = ArrayList<Question> ()
        val que1 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_argentina,
            "ARGENTINA", "RUSSIA",
            "BRAZIL", "PORTUGAL", 1
        )
        getQuestion.add(que1)

        val que2 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_belgium,
            "JAPAN", "GERMANY",
            "BELGIUM", "BELARUS", 3
        )
        getQuestion.add(que2)

        val que3 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_australia,
            "ENGLAND", "USA",
            "ARGENTINA", "AUSTRALIA", 4
        )
        getQuestion.add(que3)

        val que4 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_denmark,
            "CHINA", "ISRAEL",
            "DENMARK", "KUWAIT", 3
        )
        getQuestion.add(que4)

        val que5 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_india,
            "INDIA", "AUSTRALIA",
            "ICELAND", "NEW ZEALAND", 1
        )
        getQuestion.add(que5)

        val que6 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_fiji,
            "SUDAN", "FIJI",
            "YEMEN", "GREENLAND", 2
        )
        getQuestion.add(que6)

        val que7 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_brazil,
            "FINLAND", "MALAYSIA",
            "PERU", "BRAZIL", 4
        )
        getQuestion.add(que7)

        val que8 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_kuwait,
            "IRAN", "KUWAIT",
            "IRAQ", "UAE", 2
        )
        getQuestion.add(que8)

        val que9 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_new_zealand,
            "AUSTRALIA", "MEXICO",
            "BELGIUM", "NEW ZEALAND", 4
        )
        getQuestion.add(que9)

        val que10 = Question(
            1, "What Country does this Flag belongs to ? ",
            R.drawable.ic_flag_of_germany,
            "GERMANY", "LIBYA",
            "TAIWAN", "POLAND", 1
        )
        getQuestion.add(que10)


        return getQuestion
    }

}