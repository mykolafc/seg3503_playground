# seg3503_playground

| Outline | Value |
| --- | ---- |
| Name | Mykola Forest-Chomyn and Carolina González |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor | Mohammed Ali Ibrahim mibrahi3@uottawa.ca|
| TA | Joseph Abonasara jabon028@uotttawa.ca  |


# Screenshots de l'application (SpotBugs et Calculator)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/51bf8286-a9fd-457f-b298-da1fecd70e5a)

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/2f035e8a-30ab-4bf4-ae4c-4346c764daff)

# Total de bugs
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/db7f9d7b-ed15-4cd6-8184-d4eb9fb0c300)

# Bugs corrigées 
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/ffc01bfd-bb0d-4e74-8888-d6f95baea11f)

# ANALYSE DES RÉSULTATS

# Fixed Bugs
Bug 1: Comparison of String parameter using == or !=

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/c9cf0b23-ba05-4c53-951f-35d9faef5927)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/971f03f5-9a5f-4b57-a499-a1e927fbe039)
 

Bug 4: Private method is never called
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/e9b91e1d-4d35-4d35-9c75-54258e45777f)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/d3e93a5f-c420-4835-bb2b-bf851b03812d)
(méthode éliminé)

Bug 5-6: Boxing/unboxing to parse a primitive

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/3168da78-741a-4940-ba9b-278fc05af24c)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/37b852d6-9ea1-4253-b478-a4e2f2e415f5)


Bug 7-12: Champ non lu : ce champ doit-il être statique?

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/35499904-615f-4f27-98b9-c8088c720542)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/541b7417-6c66-437c-bab1-3ee69add66b5)

Bug 13: This method uses the same code to implement two branches of a conditional branch.

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/7c35860b-43f5-499f-bc32-fe201e93ab63)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/c4b0bb9e-a3ee-4654-a45d-3809d83c8fd6)

Bug 14: This method contains a switch statement where default case is missing.

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/ef75241e-0c54-4745-9370-72a146dbd670)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/e782332c-dfa7-449d-9f63-943f4d4ace5c)

Bug 15-17: This condition always produces the same result as the value of the involved variable that was narrowed before (Condition has no effect)

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/b2dc8f93-ab2b-45b0-8b3a-b348250072fe)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/a43a7055-e817-480a-8b90-a6a4ec7de9d2)

Bug 18:This condition always produces the same result as the value of the involved variable that was narrowed before (Condition has no effect)

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/cbc3637a-7b93-43fb-8441-140558d0d455)
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/bea95f46-2356-456f-a4b4-27105d5105f0)


# Missing Bugs
Bug 2: Certain swing methods needs to be invoked in Swing thread
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/1d990353-e0e2-419f-97e9-325733d7fa1a)
 The Swing methods show(), setVisible(), and pack() will create the associated peer for the frame. With the creation of the peer, the system creates the event dispatch thread. This makes things problematic because the event dispatch thread could be notifying listeners while pack and validate are still processing. This situation could result in two threads going through the Swing component-based GUI -- it's a serious flaw that could result in deadlocks or other related threading issues. A pack call causes components to be realized. As they are being realized (that is, not necessarily visible), they could trigger listener notification on the event dispatch thread.
 
Bug kind and pattern: SW - SW_SWING_METHODS_INVOKED_IN_SWING_THREAD

Bug 3: Could be refactored into a named static inner class
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/1911fe30-f1ad-4622-9a14-a17ddfefc003)
This class is an inner class, but does not use its embedded reference to the object which created it.  This reference makes the instances of the class larger, and may keep the reference to the creator object alive longer than necessary.  If possible, the class should be made into a static inner class. Since anonymous inner classes cannot be marked as static, doing this will require refactoring the inner class so that it is a named inner class.

Bug kind and pattern: SIC - SIC_INNER_SHOULD_BE_STATIC_ANON
