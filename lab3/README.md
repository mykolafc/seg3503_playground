# seg3503_playground

| Outline | Value |
| --- | ---- |
| Name | Mykola Forest-Chomyn and Carolina González |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor | Mohammed Ali Ibrahim mibrahi3@uottawa.ca|
| TA | Joseph Abonasara jabon028@uotttawa.ca  |

**Jacoco - Couverture de Date AVANT l'implementation de tests manquant**

<img width="895" alt="Screen Shot 2023-06-01 at 5 16 25 PM" src="https://github.com/mykolafc/seg3503_playground/assets/90519945/96313492-c1ff-4241-9883-7a4213d49e0b">

**Jacoco - Couverture de Date APRÈS l'implementation de tests manquant (mais sans REFACTORING)**

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/2702137b-230a-41d4-bdda-f5deb8b8a462)

**TESTS MODIFIÉS
DateTest.java**

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/6534628e-64d7-4952-83b0-29387a61d489)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/6c1fa4d3-2d8d-47ae-9f85-ccc2adfa3441)

**DateNextDateOKTest.java**

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/dcee60f0-39ac-47b9-aae7-113c4aaf9381)

**DateExceptionTest.java**

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/91f45a8c-5578-4be2-b736-01fa3974e0ce)

**Test Cases Explained**

We use Jacoco to know which functions in Date.java were yet to be completely tested with the already implemented tests. In this sense, whenever we saw a percentage less than 100% we would acces the method in order to see the branch coverage.  We contonued doing this until for the method isEndoftheYear() we kept getting 1/16 branches missing. Thus, we started decomposing the condition in order to get a flowchart and confirm if we were implementing the 16 conditions. While doing this, we only got 14 branches so we though our analysys was wrong and thus, rewrote the function as separated if statements rather than a refactored version because it was easier to read and validate. 

Separated if statements:
In doing so, we manage to notice a redundancy in the if(this.month==2 && day==29 && leap) because every single time February has 29 days, it is a leap year. In this sense, we fixed that and ran jacoco, which now did give us 100%. 

Refactored **CORRECTED** version. 

However, we were confused still because we did not add any tests to reach 16, so we went to check the branches missing and turns out we had only 14 branches, which is what our initial analysys showed. In this sense, we were able to conclude that a redundancy in an if statement is equal to one accesible and one inaccesible branch, as an exception would be thrown. This explains why we could not get more than 15 branches and why after we remove it we got 14 brfances total, which we covered, but 14 is okay because again, it is redundant. 
