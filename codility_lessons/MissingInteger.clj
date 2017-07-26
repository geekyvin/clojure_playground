(defn missing-integer[A]
  (let [A' (distinct A)
        n (count A')
        shld-sum (reduce + (range 1 (+ 2 n)))
        gvn-sum (reduce + A')]
      (- shld-sum gvn-sum)))

(missing-integer [1 3 6 4 1 2])
