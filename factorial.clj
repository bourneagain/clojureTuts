(defn fact [i] 
    (if (zero? i)
        1
        (* i (fact (dec i)))
    )
)
