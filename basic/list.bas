10 TYPE list
 nextlist AS list
 value AS STRING
END TYPE
50 DIM firstList AS list
60 firstList.value = "List "
70 DIM secondList AS list
80 firstList.nextList = secondList
90 secondList.value = "test"
100 PRINT firstList.value
103 IF fistList.data == "" THEN GOTO 110
105 firstList = firstList.nextList
107 GOTO 100
110 END
