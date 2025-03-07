package org.Practice;

import java.util.ArrayList;
import java.util.List;

//Defines a one-to-many dependency between objects so that when one object changes state,
// all its dependents are notified and updated automatically.

    interface  Observer{
        void update(String message);
    }
    class Subscriber implements Observer{
        private String name;
        public Subscriber(String name){
            this.name=name;
        }

        public void update(String message){
            System.out.println(name+ " recieved "+message);
        }

    }

    class Channel{
        private List<Observer>subscribers =new ArrayList<>();
        public void subscribe(Observer observer){
            subscribers .add(observer);
        }
        public void notifySubscribers(String vedio){
            for(Observer subscriber:subscribers){
                subscriber.update("New vedio:"+vedio);
            }
        }
    }

public class ObserverPattern {

        public static void main(String [] args){

            Channel channel=new Channel();
            Observer user1=new Subscriber("Reddy");
            Observer user2=new Subscriber("Bhuvana");
            channel.subscribe(user1);
            channel.subscribe(user2);

            channel.notifySubscribers("Observer Pattern in Java");
        }
}
