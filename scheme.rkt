(define (echo)
  (define in (read-line))
  (display "You said ")
  (displayln in))

(define (addition x y)
  (define sum (+ x y))
  (display s))

(define (compare str1 str2)
  (equal? str1 str2))

(define (list-example l)
  (car (cdr l)))

(define (fib n)
  (define (fof n a b)
    (cond ((= n 0) a)
	  ((= n 1) b)
	  (#t (fof (- n 1) b (+ a b)))))
  (fof n 0 1))
