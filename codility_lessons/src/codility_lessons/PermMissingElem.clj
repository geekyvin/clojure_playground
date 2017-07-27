(def A [2 3 1 5])

(def n 4)

(defn perm-missing-elem [A n]
  (let [shld-sum (reduce + (range 1 (+ 2 n)))
        gvn-sum (reduce + A)]
      (- shld-sum gvn-sum)))

(perm-missing-elem A 4)
