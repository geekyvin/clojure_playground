
(def input-arr [3,5,6,4,1,2])

(def input-pair {1 3, 2 6, 5 2})

(def n (count input-pair))

(do input-arr)

(input-pair 5)

(defn is-pair-of [x y pair]
            (or (= (pair x) y) (= (pair y) x)))

(= (input-pair 3) 2)

(is-pair-of 3 1 input-pair)

(rest input-arr)

(defn [input-arr input-pair m]
  (if (is-pair-of (first input-arr) (second input-arr) input-pair)
    (recur (drop 2 input-arr) input-pair 20)
    ))

;;http://www.geeksforgeeks.org/minimum-number-of-swaps-required-for-arranging-pairs-adjacent-to-each-other/

(defn swaper [input-arr]
(if (is-pair-of (first input-arr) (second input-arr))
  (recur (drop 2 input-arr))
  (inc (min () ) )
