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


;;;; This example shows how to reify a multi-arity protocol function
;;;; (note the different style in defprotocol vs reify)

;; define a multi-arity protocol function blah
(defprotocol Foo
    (blah
              [this x]
                  [this x y]))

;; define an anonymous extension via reify
(def r (reify Foo 
                  (blah [_ x] x)
                           (blah [_ x y] y)))

;; invoke blah via the r instance
(blah r 1)   ;; => 1
(blah r 1 2)   ;; => 2
