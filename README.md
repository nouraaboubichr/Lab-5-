# TP5

# Exercice 1 - Hiérarchie de comptes bancaires

* Cet exercice permet de mettre en place une hiérarchie de classes représentant différents types de comptes bancaires.
* La classe `Compte` contient les éléments communs : un identifiant généré automatiquement, le solde et les opérations principales comme le dépôt, le retrait et l'affichage.
* `CompteEpargne` étend la classe `Compte` en ajoutant un taux d'intérêt et une méthode permettant de calculer les intérêts sur le solde.
* `CompteCourant` hérite également de `Compte`, mais adapte la méthode de retrait afin de permettre un découvert dans la limite autorisée.
* Les différentes classes personnalisent leur affichage pour présenter leurs informations spécifiques.
* Cet exercice permet ainsi de comprendre l'héritage et la redéfinition des méthodes, tout en réutilisant les fonctionnalités communes de la classe parent.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022439.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022447.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022507.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022536.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022549.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022558.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 022616.png" />

# Exercice 2 - Gestion d'un zoo avec tableau dynamique d'animaux

* Le but de cet exercice est de représenter un zoo contenant plusieurs catégories d'animaux.
* La classe `Animal` regroupe les informations communes telles que l'identifiant, le nom et l'âge, ainsi qu'un comportement général.
* Les classes `Mammifere`, `Oiseau` et `Reptile` dérivent de `Animal` et ajoutent leurs caractéristiques et comportements particuliers.
* La classe `Zoo` utilise un tableau de type `Animal` pour stocker les différents animaux. Ce tableau peut être agrandi automatiquement lorsqu'il atteint sa capacité maximale.
* Grâce à l'héritage, un même tableau peut contenir des mammifères, des oiseaux et des reptiles.
* Lors de l'affichage, chaque objet utilise automatiquement sa propre version de la méthode redéfinie, ce qui permet d'illustrer le polymorphisme.

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 023907.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 023922.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 023935.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 023944.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 023958.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024017.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024048.png" />


# Exercice 3 - Parc de véhicules avec héritage et composition

* Cet exercice permet d'étudier à la fois l'héritage et la composition à travers la gestion d'un parc de véhicules.
* `Vehicule` constitue la classe principale contenant les informations communes, notamment l'identifiant et le modèle.
* `Motorise` hérite de `Vehicule` et ajoute les éléments liés à un véhicule motorisé : moteur, carburant et kilométrage, ainsi que les opérations de démarrage, de déplacement et de ravitaillement.
* La classe `Moteur` est utilisée par composition : un véhicule motorisé possède un moteur, mais il n'est pas lui-même un moteur.
* `Voiture`, `Camion` et `Moto` héritent de `Motorise` et possèdent chacun une caractéristique particulière.
* `VoitureElectrique` hérite également de `Motorise`, mais adapte le ravitaillement pour représenter la recharge de la batterie.
* Si le niveau de carburant est insuffisant pour effectuer un trajet, un message d'avertissement est affiché et le déplacement n'est pas réalisé.
* Enfin, la classe `Flotte` permet de gérer les véhicules dans un tableau dynamique et de calculer certaines informations générales, comme la distance totale parcourue.
<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024637.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024655.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024705.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024719.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024731.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024744.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024801.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024813.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024825.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024837.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 024844.png" />

<img width="1270" height="674" alt="1" src="image/Capture d'écran 2026-09-11 025329.png" />
# Exercice 4 - Gestion d'une bibliothèque

* Dans cet exercice, on développe une bibliothèque pouvant gérer plusieurs types de documents.
* La classe `Document` contient les informations communes aux documents, notamment un numéro d'enregistrement généré automatiquement, un titre et un auteur éventuellement absent.
* Les classes `Livre` et `Journal` héritent de `Document` et ajoutent leurs propres informations : nombre de pages et éditeur pour un livre, date de publication et numéro pour un journal.
* Les attributs sont privés afin de respecter le principe d'encapsulation. Leur accès se fait à travers des méthodes prévues à cet effet.
* La classe `Bibliotheque` stocke les documents dans un tableau de capacité fixe et fournit plusieurs opérations : ajouter, supprimer, rechercher et afficher les documents, ainsi que lister les auteurs.
* Le programme principal propose un menu permettant à l'utilisateur d'effectuer différentes opérations sur la bibliothèque jusqu'à la sélection de l'option de sortie.
* Cet exercice permet notamment de pratiquer l'héritage, l'encapsulation, le polymorphisme et la gestion d'un tableau d'objets.
