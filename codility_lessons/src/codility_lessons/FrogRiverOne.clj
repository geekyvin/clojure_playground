
(defn frog-river-one [A x]
  (let [A' (vec (range 1 (inc x)))]
    (loop [i 0
           B []]
          (if (= A' (vec (sort B)))
            i
            (recur (inc i) ( distinct (conj B (nth A i))))))))

(test_loop [3 1 4 2 3 5 4] 5)
