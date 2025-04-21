package Classwork;
    
    public class two_Sum {
        public static void main(String[] args) {
            // int []arr ={3,2,1,6,5};

            // Brute force
            // int k = 8;
            // boolean found = false;
            // int count = 0;
            // for(int i=0;i<arr.length;i++){
            //     for (int j = i+1; j < arr.length; j++) {
            //         if(arr[i]+arr[j] == k){
            //             System.out.println("pair found for"+arr[i]+"+"+arr[j]+" = "+"k");
            //             found = true;
            //             break;
            //         }
                    
            //     }
            // }
            
            // // Optimized condition,Duplicate pairs removed
            // if(!found){
            //     System.out.println("No pairs found to add up for "+k);
            // }

           
            
                    // if(arr[i]<arr[j]){
                    //     arr[]
                    // }
                // }
            // }

            //OPTIMIZED CODE WITH A SINGLE LOOP, TIME COMPLEXITY IS O(nlogn)
            int []arr ={1,2,3,5,6};
            int k = 8;
            int left = 0;
            int right = arr.length-1;
           

        while(left <= right){
            int sum = arr[left] + arr[right];
            if(sum == k){
                System.out.println("target pairs achieved for "+ k +"=" +arr[left]+","+arr[right] );
                left++;
                right--;
            }
            else if(sum < k){
                left++;
               
            }
            else{
                right--;
            }
          }    
        }
    }
    