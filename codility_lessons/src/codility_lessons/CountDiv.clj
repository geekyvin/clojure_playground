;; Test cases
;; [1,1,1] = 1
;; [0,99,2] = 50
;; [0, 100, 3] = 34
;; [11,345,17] = 20
;; [10,10,5] = 1
;; [3, 6, 2] = 2
;; [6,11,2] = 3
;; [16,29,7] = 2
;; [1,2,1] = 2

;; fix bugs related to rounding

(defn count-div [A B K]
  (Math/round (double (+ (- (/ B K) (/ A K))
                         (if (= (mod A K) 0) 1 0)))))

(count-div 6 11 2)
(count-div 1 1 1)
(count-div 0 99 2)
(count-div 0 100 3)
(count-div 11 345 17)
(count-div 6 11 2)


()
