(defn pow [n m]
  (if (zero? m) 
    1 
    (* n (pow n (dec m)))
  )
)
(println (pow 2 10))
