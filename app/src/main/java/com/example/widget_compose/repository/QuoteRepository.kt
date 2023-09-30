package com.example.widget_compose.repository

import androidx.compose.ui.graphics.Color
import androidx.datastore.preferences.core.stringPreferencesKey

class QuoteRepository {

    val currentQuotePreferenceKey = stringPreferencesKey("currentQuote")

    private val quoteList = listOf(
        "The first and biggest step is believing the life you want is possible.",
        "Stop making C+ decisions while praying for an A+ life.",
        "Stop being scared of your own potential.",
        "Life is the art of drawing without an eraser. ― John W. Gardner",
        "The whole future lies in uncertainty; live immediately. ― Seneca",
        "The reward for our work is not what we get, but what we become. ― Paulo Coelho",
        "Embrace your inner warrior, rise above the negativity, and stay focused on your goals.",
        "Don't hold yourself back, and always know that you are capable of anything you set your mind to.",
        "The people who are crazy enough to think they can change the world are the ones who do.",
        "Wait for the one, but don't wait for someone to be the one.",
        "What we know is a drop, what we don't know is an ocean. ― Isaac Newton",
        "Do not give up, the beginning is always the hardest.",
        "Sometimes trying to prove that you are the best is an insult!",
        "Do hard things daily. Stop quitting when it gets hard.",
        "Dear God, Today I woke up. I am healthy. I am alive. Thank you!",
        "The fear we don't face becomes our limit.",
        "You can either do it now or regret it later.",
        "Keep your struggle a secret until it succeeds.",
        "Grind for your dream like your life depends on it. Because it does.",
        "You will never find a rainbow if you are looking down.",
        "If you spend too much time thinking about a thing, you will never get it done.",
        "One day, all the early mornings, late nights, and sacrifices will make you a legend.",
        "It may take a month, a year, or a decade but if you want it bad enough, you will make it happen.",
        "Inhale courage, exhale fear.",
        "Not all storms come to disrupt your life, some come to clear your path.",
        "Stay original and let the world copy you.",
        "Champions don't show up to get everything they want. They show up to give everything they have.",
        "To be calm is the highest achievement of the self.",
        "Be tolerant with others and strict with yourself. ― Marcus Aurelius",
        "Choose your happiness over everything.",
        "Do not confuse denial with hope.",
        "The good things you make, make you good!",
        "Before you can hit the jackpot, you have to put a coin in the machine.",
        "The more you listen, the more you hear.",
        "Make sure you remember to smile today!",
        "Do not attend every argument you are invited to!",
        "Persistent and consistent effort over time can yield results.",
        "Do not forget that forgiveness is something we do for others!",
        "Other people's opinions are the biggest poison to your happiness.",
        "The journey of a thousand miles begins with a single step. ― Lao Tzu",
        "They don't like you because they are not like you!",
        "Your fear doesn't know your strength.",
        "Tough times don't last, tough people do.",
        "So far you've survived 100% of your worst days.",
        "Anyone trying to put you down is already below you.",
        "Know when to hustle and when to rest.",
        "That move you're afraid of make could be the game changer.",
        "Become someone no one thought you could be. Not even you.",
        "To the mind that is still, the whole universe surrenders. ― Lao Tzu",
        "We don't judge people when we feel good about ourselves. ― Brene Brown",
        "Manifest quietly. You've never heard a tree grow.",
        "Work on you, for you, in all ways, always.",
        "The axe forgets what the tree remembers. ― African Proverb",
        "When the roots are deep there is no reason to fear the wind. ― African Proverb",
        "The measure of a man is what he does with power. ― Plato",
        "The meaning of life is to give life meaning. ― Viktor Frankl",
        "The story is not in the words; it's in the struggle. ― Paul Auster",
        "Being like everybody is the same as being nobody. ― Rod Serling",
        "The moment you understand something, you are free of it. ― Jiddu Krishnamurthy",
        "What is thoroughly understood will not repeat itself. ― Jiddu Krishnamurthy",
        "Seeing the illusion is the beginning of intelligence. ― Jiddu Krishnamurthy",
        "Calm is the ruler of form, and silence is the master of sound. ― Wen Tzu",
        "If everything around you seems dark. Look again. You may be the light. ― Rumi",
        "Those who flow as life flows knows they need no other force. ― Lao Tzu",
        "Some people feel the rain, others just get wet. ― Bob Marley",
        "The art of knowing is knowing what to ignore. ― Rumi",
        "Do not pray for an easy life, pray for the strength to endure a difficult one!",
        "Paths are made by walking.",
        "Practice until you are the best. Practice to remain the best.",
        "Work until your mind forgets and your body remains.",
        "WHO CARE?",
        "If you are irritated by every rub, how will you be polished? ― Rumi",
        "To a great mind, nothing is little. ― Sherlock Hoemes",
        "What you seek is seeking you. ― Rumi",
        "When a flower doesn't bloom you fix the environment in which it grows, not the flower.",
        "As you start to walk out on the way, the way appears. ― Rumi",
        "Win in your mind, and you will win in your reality.",
        "Nothing changes if nothing changes.",
        "Know the rules well, so you can break them effectively. ― Dalai Lama",
        "It takes nothing to join the crowd, it takes everything to stand alone.",
        "The will must be stronger than your skill. ― Mohammad Ali",
        "Forgive your old self, you've changed.",
        "Make the rest of your life the best of your life.",
        "Don't be jealous of people, be inspired.",
        "Don't be easy to define. Let them wonder about you.",
        "Improvement begins with I.",
        "If you can't build with them, don't chill with them.",
        "It's not the load that weighs you down, it's the way you carry it. ― C. S. Lewis",
        "The eyes are useless when the mind is blind.",
        "No beauty shines brighter than a good heart.",
        "Step by step, day by day.",
        "It takes nothing to appreciate others.",
        "When we blame ourselves we feel no one else has a right to blame us. ― Oscar Wilde",
        "It is always the unreadable that occurs. ― Oscar Wilde",
        "Be the adult you needed as a child.",
        "Tears will get you sympathy, sweat will get you change. ― Jesse Jackson",
        "Never look back unless you're seeing how far you've come.",
        "God's timing might be sooner than you think, be ready.",
        "Anyone can dream it. Show the world you can do it.",
        "Those who can find the light in the darkness will always be victorious.",
        "You still have a lot of time to make yourself be what you want.",
        "Instead of thinking how hard your journey is, think how great your story will be...",
        "There is no change where there is no action.",
        "Discipline is rarely enjoyable, but almost always profitable.",
        "One of the keys to moving ahead is knowing what to leave behind.",
        "Wait until you see why God made you wait.",
        "If you fail, pray to God. If you win, pray to God.",
        "The real you is who you are when ain't nobody watching.",
        "For your peace of mind, do not try to understand everything.",
        "You've never been ready for what you have to do. You just do it. That makes you ready.",
        "Sometimes the fear won't go away, so you'll have to do it afraid.",
        "Go confidently in the direction of your dreams. Live the life you have imagined. ― Henry David",
        "Your life is your story. Write well. Edit often.",
        "Be so rooted in yourself that nobody's absence or presence can disturb your inner peace.",
        "Hustle like you have no friends. Grind like nobody has your back.",
        "Never beg for a seat when you can build your own table.",
        "You move differently when you know your power.",
        "It starts hitting them when it stops hitting you.",
        "Almost everything will work again if you unplug it for a few moments, including you.",
        "Remember that sometimes not getting what you want is a wonderful stroke of luck. ― Dalai Lama",
        "Pay the price today so that you can pay any price tomorrow.",
        "Don't let your bad days trick you into thinking you have a bad life.",
        "The aim of life isn't to fit in. Your true mission is to stand out.",
        "The world is great mirror. It reflects back to you what you are.",
        "A great man is hard on himself; a small man is harder on others."
    )

    fun getRandomQuote(): String {
        return quoteList.random()
    }

    fun getQuoteList(): List<String> {
        return quoteList
    }

    /*private fun quotesFromJson() {
        val jsonData = Quotes(quoteList)
        val jsonArray = JSONArray(jsonData)
        val quotes = ArrayList<String>()

        for(i in 0 until jsonArray.length()){
            quotes.add(jsonArray[i].toString())
            println(quotes[i])
        }

        //val content = context.assets.readAssetsFile("quotes.json")
    }

    private fun AssetManager.readAssetsFile(filename: String): String {
        return open(filename).bufferedReader().use { it.readText() }
    }*/

    private val colorList: List<Color> = listOf(
        Color.White, Color.LightGray,
        Color(0xFF6750A4), Color(0xFF775260),
        Color(0xFFEFB8C8), Color(0xFFF2B8B5),
        Color(0xFF938F99), Color(0xFFFEDAB3),
        Color(0xFFAECAB3), Color(0xFFDDBAF7),
        Color(0xFFAC7B55), Color(0xFFFFEB3B),
        Color(0xFFE8E638), Color(0xFFA8E638),
        Color(0xFF4DD874), Color(0xFF4DA478),
        Color(0xFF985EDB), Color(0xFFD65A82),
        Color(0xFFA65A8A), Color(0xFF6FDDBE),
        Color(0xFFAFDDBE), Color(0xFFAF3DBE),
        Color(0xFF4186DA), Color(0xFFB186DA),
        Color(0xFFEF8A6A), Color(0xFFDC60F1),
        Color(0xFF81E485), Color(0xFFED4747),
        Color(0xFF97ED47), Color(0xFF47CFED),
        Color(0xFF6BD19B), Color(0xFF92D16B),
    )

    fun getRandomColor(): Color {
        return colorList.random()
    }
}
