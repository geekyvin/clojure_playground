(defn cyclic-rotation [A k]
  (drop (dec k) (take (+ (dec k) (count A)) (cycle A))))

(def A [3 8 9 7 6])

(cyclic-rotation A 3)

(cyclic-rotation (range -1000 0) 3)

(cyclic-rotation (range 1 1000) 6)
