(defn perm-check [A]
  (let [gvn-sum (reduce + A)
        exp-sum (reduce + (range 1 (inc (count A))))]
      (if (= gvn-sum exp-sum) 1 0)))


(perm-check [4 1 3 2])

(perm-check [4 1 3])

(perm-check (range 1 100000))

(perm-check (drop 2 (range 1 100000)))
