package org.uchennaofodile.MessagingRabbitmqApplication;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;


//POJO
//The reciever responds to published messages
//Defines a method for recieving messages
@Component
public class Receiver {

  private CountDownLatch latch = new CountDownLatch(1);

  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
    latch.countDown();
  }

  public CountDownLatch getLatch() {
    return latch;
  }

}