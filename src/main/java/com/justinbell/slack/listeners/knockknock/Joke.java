package com.justinbell.slack.listeners.knockknock;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Justin.Bell on 7/1/2015.
 */
public class Joke {

    private MessageType nextType;
    private Map<MessageType, String> responses;

    public Joke(Map<MessageType, String> responses) {
        nextType = MessageType.INITIALIZER;
        this.responses = responses;
        responses.put(MessageType.INITIALIZER, "Knock knock");
    }

    public Joke(String whoIsThere, String who) {
        nextType = MessageType.INITIALIZER;
        responses = new HashMap<>();
        responses.put(MessageType.INITIALIZER, "Knock knock");
        responses.put(MessageType.WHO_IS_THERE, whoIsThere);
        responses.put(MessageType.WHO, who);
    }

    public String getResponse(MessageType messageType) {
        String response = null;
        response = responses.get(messageType);
        if (response == null) {
            response = "My joke seems to be broken...";
        }
        return response;
    }

    public void advanceNextType(MessageType messageType) {
        if (nextType.equals(messageType)) {
            switch (nextType) {
                case INITIALIZER:
                    nextType = MessageType.WHO_IS_THERE;
                    break;
                case WHO_IS_THERE:
                    nextType = MessageType.WHO;
                    break;
                case WHO:
                    nextType = MessageType.NONE;
                    break;
                case NONE:
                    break;
            }
        }
    }

    public MessageType getNextType() {
        return nextType;
    }

    private static Joke[] jokes = {
            new Joke("A herd", "A herd you were home, so I came over!"),
            new Joke("A little old lady", "Oh! I didn’t know you could yodel."),
            new Joke("Abbot", "Abbot you don’t know who this is!"),
            new Joke("Agatha", "Agatha toothache. Do you have an athpirin?"),
            new Joke("Al", "Al give you a kiss if you open this door!"),
            new Joke("Alex", "Alex the questions round here!"),
            new Joke("Alex", "Alex-plain later!"),
            new Joke("Alzheimer’s Patient.", "Knock Knock."),
            new Joke("Amos", "A mosquito."),
            new Joke("Annie", "Annie body home?"),
            new Joke("Anthem", "You Anthem devil you!"),
            new Joke("Anudder", "Anudder mosquito."),
            new Joke("Arizona!", "Listen buddy, Arizona room for one of us in this town!"),
            new Joke("Atch", "Bless you!"),
            new Joke("B-4", "Open the door B-4 I freeze to death!"),
            new Joke("Baby Owl", "Baby Owl buy you anything you want, just let me in! It’s freezing out here!"),
            new Joke("Ben", "Ben knocking For 10 minutes."),
            new Joke("Boo!", "Don’t cry it’s only a joke!"),
            new Joke("Broken pencil", "Ah never mind. its a pointless joke."),
            new Joke("Canoe", "Canoe come out and play?"),
            new Joke("Cash", "No thanks, but I’ll take a peanut if you have one."),
            new Joke("Claire", "Claire the way, I’m coming through!"),
            new Joke("Closure", "Closure mouth when you’re eating!"),
            new Joke("Dee", "Dee-licious cookies for sale!"),
            new Joke("Dewey", "Dewey have to go to school today?"),
            new Joke("Dishes", "Dishes the police! Come out with your hands up!"),
            new Joke("Doris", "Doris locked, that’s why I’m knocking!"),
            new Joke("Dumbbell", "Dumbbell doesn’t work so I had to knock."),
            new Joke("Dwayne", "Dwayne the bathtub, I'm drowning!"),
            new Joke("Eskimo Christian Italian", "Eskimo Christian Italian no lies. (Ask me no questions, I’ll tell you no lies)"),
            new Joke("Etch", "Bless you!"),
            new Joke("Figs", "Figs the dang doorbell so I don’t have to keep knocking."),
            new Joke("Hawaii", "I’m fine, Hawaii you?"),
            new Joke("Heart", "Heart to hear you, please speak louder!"),
            new Joke("Heaven", "Heaven seen you in ages."),
            new Joke("Heidi", "Heidi clare war on you."),
            new Joke("Honey bee", "Honey bee a dear and get me a beer."),
            new Joke("Howl", "Howl you know unless you open the door?"),
            new Joke("Ice cream soda!", "ICE CREAM SODA PEOPLE CAN HEAR ME!"),
            new Joke("Ima", "Ima psychiatrist. I’m here ’cause you won’t open up!"),
            new Joke("Iowa", "Iowa big apology to the owner of that blue car!"),
            new Joke("Iran", "Iran over your mail box and garbage cans. Sorry bout that."),
            new Joke("Isabel", "Isabel working? I had to knock."),
            new Joke("Ivor", "Ivor you let me in or I`ll climb through the window."),
            new Joke("Jess", "Jess me and my shadow."),
            new Joke("Justin", "Just in the neighborhood, thought I would drop by."),
            new Joke("Keith", "Keith me, my thweet printh, but look out for my looth tooth"),
            new Joke("Ken", "Ken you open the door, please?"),
            new Joke("Kent", "Kent you tell by my voice?"),
            new Joke("Knee?", "Knee-d you even ask?"),
            new Joke("Lettuce", "Lettuce in it’s cold out here."),
            new Joke("Little old lady", "Hey, I didn’t know you could yodel!"),
            new Joke("Luck", "Luck through the keyhole and you’ll find out!"),
            new Joke("Madam", "Madam foot is caught in the door!"),
            new Joke("Mary", "Mary me and I’ll love you forever!"),
            new Joke("Nana", "Nana your business."),
            new Joke("Noah", "Noah good place we can get something to eat?"),
            new Joke("Nobel", "No bell, that’s why I knocked!"),
            new Joke("Nunya", "Nunya business. That’s who."),
            new Joke("Oink oink", "Make up your mind, are you a pig or an owl?!"),
            new Joke("Olive", "Olive you!"),
            new Joke("Ooze", "Ooze in charge round here?"),
            new Joke("Orange juice", "Orange juice going to let me in?"),
            new Joke("Otto", "Otto know. I think I’ve got amnesia."),
            new Joke("Owls", "Yes, yes they do."),
            new Joke("Pete", "Pete-za delivery guy!"),
            new Joke("Radio", "Radio not, here I come!"),
            new Joke("Razor!", "Razor hands, this is a stick up!"),
            new Joke("Repeat", "Who Who!"),
            new Joke("Sarah", "Sa-rah phone in there I can use?"),
            new Joke("Scott", "Scott nothing to do with you!"),
            new Joke("Shelby", "Shelby comin’ round the mountain when she comes!"),
            new Joke("Soup", "Superman. Duh!"),
            new Joke("Spain", "Spain to have to keep knocking on this door."),
            new Joke("Spider", "In spider what everyone says, I kinda’ like you!"),
            new Joke("Tank", "You’re welcome"),
            new Joke("Tex", "Tex two to tango!"),
            new Joke("The Doctor", "Exactly."),
            new Joke("To", "To whom."),
            new Joke("Toby", "Toby or not to be. That is the question."),
            new Joke("Tom Sawyer", "I heard Tom Sawyer underwear."),
            new Joke("Two knee", "Two-knee fish!"),
            new Joke("Usher", "Usher wish you would let me in!"),
            new Joke("Viper", "Viper nose, it’s running!"),
            new Joke("Wendy", "Wendy wind blows de cradle will rock."),
            new Joke("Will", "Will you open the door already?"),
            new Joke("Woo", "Don’t get so excited, it’s just a joke."),
            new Joke("Wooden Shoe", "Wooden Shoe like to know!?"),
            new Joke("Yeah", "Easy there cowboy!"),
    };

    public static Joke getRandomJoke() {
        return jokes[new Random().nextInt(jokes.length)];
    }

}
