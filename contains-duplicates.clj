(defn contains-dup [i] 

(let [countaset (count (set i)) countnonset (count i) ]
	(if (= countaset countnonset )(println "all unique")(println "not"))
)
)
