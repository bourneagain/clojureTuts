(defn fizzbuzz	[i]
        (let [ v1 (mod i 3) v2 (mod i 5) v3 (mod i 15)]  
		(cond 
			(zero? v3) (println "div 15")
			:else
				(cond 
					(zero? v1) (println "div 3")
					:else
					(cond 
						(zero? v2) (println "div 5")
						:else  "NOTHING"
					)
				)
		)
	)
)

