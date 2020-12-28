# FOL_Parser
First Order Logic Parser


Test Cases :
1) Bill has at most one sister.
FOL:
∀ x, y ( SisterOf(x, Bill) ∧ SisterOf(y, Bill) ⇒ x = y )
PROLOG:
fol(PT,[forall,x,y,"(",s,"(",x,y,")",and,s,"(",x,y,")",implies,x,=,y,")"],[]).

2)Every student loves some student.
FOL:
∀ x ( Student(x) ⇒ ∃ y ( Student(y) ∧ Loves(x,y) )).
PROLOG:
fol(PT,[forall,x,"(",s,"(",x,")",implies,exists,y,"(",f,"(",y,")",and,l,"(",x,y,")",")",")"],[]).


4)There exists a student.
FOL:
∃ x Student(x).
PROLOG:
fol(PT,[exists,x,"(",f,"(",x,")",")"],[]).

5) 
FOL:
For all x ,y (f(x) implies g(y)).
PROLOG:
fol(PT,[forall,x,y,"(",f,"(",x,")",implies,g,"(",y,")",")"],[]).



Test Cases for propositional logic: 
propos(PT,[x,and,x],[]).
propos(PT,[x,and,y],[]).
propos(PT,[x,not,y],[]).
propos(PT,[x,or,not,x],[]).
propos(PT,[not,x,or,not,y],[]).
