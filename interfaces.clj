(defprotocol AnInterface 
  (amethod [this]))

(defrecord AClass [someVariable] 
  AnInterface 
  (amethod [this] (println "passed variable, inside the method which is defined:" someVariable)))

; calling a method defined in a class AClass which implements interface name AnInterface
;(amethod (AClass. "passedVariable"))
(defn anotherMethod [someVariable] 
  (reify 
    AnInterface 
    (amethod [this] (println "passed variable, inside the method which is defined:" someVariable))))
(amethod "variableI")
