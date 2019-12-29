package com.example.quotes;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class QuoteServer {

    String[] getQuotes() {
        String[] quotes = new String[]{
                "\" Be Productive. All successful people are productive. Be work longer hours and quality hours. ",
                "\"Every positive change in life starts with a decision. In this very instance, decide to change your life forever",
                "\"Develop clear Long Term, Medium Term and Short Term Goals along with objectives.",
                "\"Self discipline is the most powerful formula for success. If you have this, then everything will work, if you don't have this, then nothing will work.",
                "\"Success requires you to pay a hefty price. Most people want to know the price but don't want to pay it. Are you ready to pay it?",
                "\"What you write, you invite. Always write down ideas, goals and everything else that is important for you",
                "\"Success has been defined in thousands of ways. For me, success is progressive improvement in all areas of my life",
                "\"Everything has consequences. Always assess the consequences of doing or not doing something!",
                "\"Dreamer bigger than others. The bigger the dreams, the bigger the urge of taking action",
                "\"Visualise your goals as if you are living them. Whatever, you can dream and believe, you can achieve",
                "\"Separate the urgent from the important. Keep important items as the must do on your list",
                "\"Resolve to become the most courageous person in your industry",
                "\"Resolve to become the most productive person in your industry",
                "\"Work effectively in your work time, play effective in your play time",
                "\"You will die one day. Live your life in such a way that you fulfill all your dreams and desires before that",
                "\"Develop a reputation for speed, productivity and trust",
                "\"Make Procrastination as your worst enemy. Hate it and do not let it come near you",
                "\"Complete small jobs as soon as they arise. Do not let them pile up",
                "\"Do the worst possible tasks first. Eat the frog",
                "\"Keep your energy levels high. The higher the energy, the better can be the productivity",
                "\"Eat right and drink lots of water",
                "\"Keep your state of mind energetic, enthusiastic and joyful",
                "\"Be passionate about life, your achievements and your goals",
                "\"Feelings are overrated. Do what you need to do, whether you feel like it or not",
                "\"Success is tons of discipline mixed with patience and perseverance",
                "\"Always keep a long term perspective but break it down into yearly, quarterly, monthly and weekly goals!",
                "\"Instant gratification is the number 1 killer of all your dreams.",
                "\"Instant gratification is the enemy of your success. ",
                "\"The more you take action, the more you start liking yourself. ",
                "\"Your self esteem is in direct proportion to the levels of your discipline and action taking abilities. ",
                "\"Discipline is doing what has to be done, irrespective of how you feel about it.",
                "\"Your feelings are not designed for you to succeed. Your feeling are designed for you to react and survive.",
                "\"Practicing solitude and silence makes you more conscious. A conscious person takes better actions!",
                "\"Your only limitations are in your mind. Defeat your limitations.",
                "\"Convert your limitations into your strengths.",
                "\"Show your vulnerable side to others sometimes but don't live in your vulnerabilities.",
                "\"Knowledge is overrated. Action is the king.",
                "\"Accept and acknowledge your fears. Take action inspite of your fears.",
                "\"If you take action inspite of your fears, your fears start to die.",
                "\"Don't jealous the rich and wealthy. Become rich and wealthy!",
                "\"Knowledge is cheap. It's available on the internet. Start taking action on your knowledge now.",
                "\"Work hard, work smart, work quick and work to inspire.",
                "\"Your brain send signals through your nervous system for you to take action. Train your brain and your nervous system to send better signals",
                "\"Everyone has excuses and reasons for not doing. You are not special. Become special, by defying your excuses!",
                "\"Do not trust everything your mind tells you. Trust your heart and your instinct. Massive action requires more of heart",
                "\"Massive action is the key to achieve the unimaginable",
                "\"You achieve the unimaginable only when you make it imaginable first for yourself",
                "\"We have been taught that obsession over anything is bad. But obsession over massive action is good!",
                "\"Want to know what you any mediocre person lacks? Written goals and massive action on them!",
                "\"Raise your standards for yourself each day. Then meet them",


        };
        return quotes;
    }
    String getRandomQuote(){
        String quote;
        int quotesArrayLen =getQuotes().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuotes()[randomNum];
        return quote;


    }

}

