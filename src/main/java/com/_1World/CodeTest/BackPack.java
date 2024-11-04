package com._1World.CodeTest;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;


public class BackPack {

  private JsonArray bag;

  //items
  private final String apples = "Bag of Apples";
  private final String trailMix = "Trail Mix";
  private final String peanutButter = "Peanut Butter";
  private final String bread = "Bread";

  //item weight
  private final int appleWeight = 5;
  private final int trailMixWeight = 3;
  private final int peanutButterWeight = 2;
  private final int breadWeight = 1;

  //initial item count
  private int numApples = 1;
  private int numTrailMix = 1;
  private int numPeanutButter = 1;
  private int numBread = 1;

  //constants
  private final String item = "item";
  private final String count = "count";

  //capacity
  private final int minCapacity = 11;
  private int maxCapacity;

  public BackPack(int capacity){
     maxCapacity = capacity;
     bag = assembleBackPack();
  }

  private JsonArray assembleBackPack(){
    JsonArray bag = new JsonArray();

    //base case
    if(maxCapacity == minCapacity){
      bag.add(new JsonObject().put(item, apples).put(count, numApples))
        .add(new JsonObject().put(item, trailMix).put(count, numTrailMix))
        .add(new JsonObject().put(item, peanutButter).put(count, numPeanutButter))
        .add(new JsonObject().put(item, bread).put(count, numBread));

       return bag;
    }

    //calculate the remaining items to add to the bag
    int remainingCapacity = maxCapacity - minCapacity;

    while(remainingCapacity > 0){

      if(remainingCapacity >= appleWeight){

        numApples += remainingCapacity / appleWeight;
        remainingCapacity = remainingCapacity % appleWeight;

      }else if(remainingCapacity >= trailMixWeight){

        numTrailMix += remainingCapacity / trailMixWeight;
        remainingCapacity = remainingCapacity % trailMixWeight;

      }else if(remainingCapacity >= peanutButterWeight) {

        numPeanutButter += remainingCapacity / peanutButterWeight;
        remainingCapacity = remainingCapacity % peanutButterWeight;

      }else{

         numBread += remainingCapacity / breadWeight;
         remainingCapacity = remainingCapacity % breadWeight;

      }
    }

    bag.add(new JsonObject().put(item, apples).put(count, numApples))
      .add(new JsonObject().put(item, trailMix).put(count, numTrailMix))
      .add(new JsonObject().put(item, peanutButter).put(count, numPeanutButter))
      .add(new JsonObject().put(item, bread).put(count, numBread));

    return bag;
  }

  public void printContents(){
    for(int i = 0; i < bag.size(); i++){
      System.out.println(bag.getJsonObject(i).toString() + "\n");
    }
  }

}
