(defn throw-catch [f]
    [(try
              (f)
                  (catch ArithmeticException e "No dividing by zero!")
                      (catch Exception e (str "You are so bad " (.getMessage e)))
                          (finally (println "returning... ")))])

; throw-catch executes the passed function
; so it needs a fucntion as parameter

(throw-catch 1)
(throw-catch +)
(throw-catch #(+ 1 2)) ; annonymous function passed
