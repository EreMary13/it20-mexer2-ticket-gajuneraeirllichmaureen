/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priority.queues;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {

    record Ticket(String name, int urgency, int arrivalOrder){}
  
    public static void main(String[] args) {
        
        int sequence = 0;
     
        PriorityQueue<Ticket> ticket = new PriorityQueue<>(Comparator.comparingInt(Ticket::urgency).thenComparingInt(Ticket::arrivalOrder));
   
        ticket.offer(new Ticket("Printer", 3, sequence++));
        ticket.offer(new Ticket("Network", 1, sequence++));
        ticket.offer(new Ticket("Login", 2, sequence++));
        ticket.offer(new Ticket("Signup", 3, sequence++));
        
        while(!ticket.isEmpty()){
        System.out.println(ticket.poll().name());
        
        }
        
    }  
}
