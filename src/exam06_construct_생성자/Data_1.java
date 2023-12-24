package exam06_construct_생성자;

import exam06_2_parameter_기본형_참조형_2.Data2;

public class Data_1 {
    int value;
    // 컴파일러가 생성자를 추가\

}
class Data_2 {
    int Value;

    Data_2(int x){
        Value = x;
        // 기본 생성자가 없기 때문에 에러 
    }
}


