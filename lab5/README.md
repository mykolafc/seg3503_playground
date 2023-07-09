# seg3503_playground

| Outline | Value |
| --- | ---- |
| Name | Mykola Forest-Chomyn and Carolina González |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor | Mohammed Ali Ibrahim mibrahi3@uottawa.ca|
| TA | Joseph Abonasara jabon028@uotttawa.ca  |

# Grades

<img width="857" alt="GradesCalculator" src="https://github.com/mykolafc/seg3503_playground/assets/90519945/8b4939d3-d5cf-4d73-86a8-7b87c629ef9a">

On a ajouté ce stub de code afin de pouvoir démontrer les valeurs possibles une fois que la calculatrice de notes de cours est fonctionnelle.
Pour l'instant, ce code ne fait que retourner une des valeurs possibles de façon aléatoire.


## Résultat sur l'application web

<img width="806" alt="WebAppOutput" src="https://github.com/mykolafc/seg3503_playground/assets/90519945/ac1d0486-d47d-40ca-bc1e-2e20323e9558">

Avec le stub de code précédent, nous pouvons maintenant voir le résultat de la calculatrice démontré sur l'application web. Par contre, puisque le stub ne retourne que des valeurs aléatoires, le résultat n'aura pas de sens et n'est pas affecté par les valeurs entrées. Additionnellement, les valeurs entre-elles n'ont pas de sens (i.e. la note numérique de '5' devrait comprendre un poucentage de '50%' mais la calculatrice démontre '80%' au lieu)

## Erreur après implémentation

<img width="990" alt="Erreur" src="https://github.com/mykolafc/seg3503_playground/assets/90519945/8bfda712-fe11-4af7-b5cf-393d828f4018">

L'erreur qui apparait en executant le programme grades est visiblement sans rapport au code de la calculatrice que nous avons ajouté. Cette erreur est reliée au framework Phoenix et son service d'hébergement web.


# Twitter

### TwitterTest.java - Test Cases:
On a implementé les 4 tests manquanyt (comme indiqué dans les code en forme des commentaires):

isMentionned_lookForAtSymbol()
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/aeb081d6-65aa-4845-8f44-1f437e7642b6)


isMentionned_dontReturnSubstringMatches()
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/5c254176-18cd-4ca6-8920-9b735ca99104)


isMentionned_superStringNotFound()
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/a99ebc43-e16f-4d83-a771-cde29f619ffa)


isMentionned_handleNull()
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/10eb8bc0-fe17-46a6-a9ea-867200e0acd4)


## Results of Tests:
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/b4842aa7-ceea-47c0-9626-4962ae441be4)


## Analysis: 
On remarque que la méthode loadTweet() a 3 résultats possibles soit "...@me", "...@you", null. 
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/8ab8ee56-d1d9-47b3-aa8f-54883845d689)

Cependant, isMentionned() ne gère pas la possibilité d'avoir null ou un substring et pour ca les deux mèthodes on pas passé. Alors, on modifie le code de cela: 
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/f0d6d6b4-0320-463a-9be2-5227b1d5b7b2)

À cela: 
![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/b92dde7c-0c7e-4360-b30c-2e512097b323)


## Results of Tests after isMentionned update:
Après avoir modifié isMentionned on a constaté que isMentionned_superStringNotFound() et isMentionned_handleNull() fonctionnaient. Néanmoins, on a remarqué que actual_call() pouvait passer ou échouer de facon aléatoire à cause de la nature RANDOM dans la méthode loadTweet() invoqué par isMentionned() invoqué par actual_call() que faut que parfois ça c'est vrai et parfois faux.

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/b569b233-7511-431a-a5d0-f5de7c0d2d7a)

![image](https://github.com/mykolafc/seg3503_playground/assets/90726597/d28bed46-19d0-42eb-a673-b3203e608b7b)



