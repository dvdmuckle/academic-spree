10 INPUT "Enter a number ", n
20 LET a = 0
30 LET b = 1
35 IF n = a THEN GOTO 110 END IF
38 IF n = b THEN GOTO 130 END IF
41 FOR i = 1 to n
50   x = a + b
60   a = b
70   b = x
80 NEXT i
90 PRINT a
100 END
110 PRINT a
120 END
130 PRINT b
140 END
