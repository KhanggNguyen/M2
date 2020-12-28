
%fol(fol(V)) --> vp(V).

%vp(vp(V))--> varr(V).
% p OR(NOT p) AND q

%fols(fols(Q,B1,F,B2,V,B3,B4)) --> quantifier(Q), openbrack(B1), varr(F) , openbrack(B2) ,varr(V) ,closebrack(B3) , closebrack(B4).


propos(propos(V,O,V))--> varr(V),or(O),varr(V).
propos(propos(V,O,N,V))--> varr(V),or(O),not(N),varr(V).
propos(propos(N,V,O,N,V))--> not(N),varr(V),or(O),not(N),varr(V).
propos(propos(V,A,V))--> varr(V),and(A),varr(V).
propos(propos(V,A,V1))--> varr(V),and(A),varr(V1).
propos(propos(V,A,V))--> varr(V),not(A),varr(V).
propos(propos(V,A,V))--> varr(V),and(A),varr(V).
propos(propos(V,A,N,P))--> varr(V),and(A),not(N),varr(P).


fol(fol(Q,V,B1,F,I,F2,B2)) --> quantifier(Q),varormore(V),openbrack(B1),functionphrase(F),implication(I),functionphrase(F2),closebrack(B2).
fol(fol(Q,V,B1,F,B2)) --> quantifier(Q),varormore(V),openbrack(B1),functionphrase(F),closebrack(B2).
fol(fol(Q,V,B1,F,A,F2,B2)) --> quantifier(Q),varormore(V),openbrack(B1),functionphrase(F), and(A),functionphrase(F2),closebrack(B2).
fol(fol(Q,V,B1,F,I,F2,B2)) --> quantifier(Q),varormore(V),openbrack(B1),functionphrase(F),implication(I),fol(F2),closebrack(B2).
fol(fol(Q,V,B1,A,I,E,B2)) --> quantifier(Q), varormore(V), openbrack(B1), andphrase(A),implication(I),equalityphrase(E),closebrack(B2).

functionphrase(functionphrase(V,B1,VC,B2))--> varr(V), openbrack(B1), varormore(VC), closebrack(B2).

andphrase(andphrase(F,A,F1))--> functionphrase(F),and(A),functionphrase(F1).

varormore(varormore(V))--> varr(V).
varormore(varormore(V,VC))--> varr(V),varormore(VC).
%varormore(varormore(C))--> const(C).
%varormore(varormore(C,VC))--> const(C),varormore(VC).

equalityphrase(equalityphrase(V,E,V1)) --> varr(V),equals(E),varr(V1).


quantifier(quantifier(forall))--> [forall].
quantifier(quantifier(exists))--> [exists].

varr(varr(a))-->[a].
varr(varr(b))-->[b].
varr(varr(c))-->[c].
varr(varr(d))-->[d].
varr(varr(e))-->[e].
varr(varr(f))-->[f].
varr(varr(g))-->[g].
varr(varr(h))-->[h].
varr(varr(i))-->[i].
varr(varr(j))-->[j].
varr(varr(k))-->[k].
varr(varr(l))-->[l].
varr(varr(m))-->[m].
varr(varr(n))-->[n].
varr(varr(o))-->[o].
varr(varr(p))-->[p].
varr(varr(q))-->[q].
varr(varr(r))-->[r].
varr(varr(s))-->[s].
varr(varr(t))-->[t].
varr(varr(u))-->[u].
varr(varr(v))-->[v].
varr(varr(w))-->[w].
varr(varr(x))-->[x].
varr(varr(y))-->[y].
varr(varr(z))-->[z].

equals(equals(=))--> [=].
openbrack(openbrack("("))-->["("].
closebrack(closebrack(")"))-->[")"].

not(not(not))--> [not].
and(and(and))-->[and].
or(or(or))-->[or].
implication(implication(impliies))--> [implies].




% const(const(A))-->[A].
% const(const(B))-->[B].
% const(const(C))-->[C].
% const(const(D))-->[D].
% const(const(E))-->[E].
% const(const(F))-->[F].
% const(const(G))-->[G].
% const(const(H))-->[H].
% const(const(I))-->[I].
% const(const(J))-->[J].
% const(const(K))-->[K].
% const(const(L))-->[L].
% const(const(M))-->[M].
% const(const(N))-->[N].
% const(const(O))-->[O].
% const(const(P))-->[P].
% const(const(Q))-->[Q].
% const(const(R))-->[R].
% const(const(S))-->[S].
% const(const(T))-->[T].
% const(const(U))-->[U].
% const(const(V))-->[V].
% const(const(W))-->[W].
% const(const(X))-->[X].
% const(const(Y))-->[Y].
% const(const(Z))-->[Z].
