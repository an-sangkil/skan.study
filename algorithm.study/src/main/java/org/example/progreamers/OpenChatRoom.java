package org.example.progreamers;

import java.util.*;

public class OpenChatRoom {

    public String[] solution(String[] record) {


        List<String []> events = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        StringBuilder strData = new StringBuilder();
        for (int i = 0; i < record.length; i++) {
            String[] tempSplit = record[i].split(" ");
            String action = tempSplit[0];
            String userId = tempSplit[1];

            if (action.equals("Enter")) {
                events.add(new String[]{action,userId});
                String name = tempSplit[2];
                map.put(userId,name);
            } else if (action.equals("Change")) {
                //events.add(new String[]{action,userId});
                String name = tempSplit[2];
                map.put(userId,name);
            } else if ( action.equals("Leave")) {
                events.add(new String[]{action,userId});
            }
        }


        String answer[] = new String[events.size()];

        for (int i = 0  ; i < events.size(); i++) {

            String action  = events.get(i)[0];
            String userId  = events.get(i)[1];
            String userNAme = map.get(userId);

            if (action.equals("Leave")) {
                answer[i] = userNAme+" " +"님이 나갔습니다.";
            } else {
                answer[i] = userNAme+" " +"님이 들어왔습니다.";
            }


        }

        return answer;
    }

    public static void main(String args[]){

        String recore[] = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};


        OpenChatRoom openChatRoom = new OpenChatRoom();
        Arrays.asList(openChatRoom.solution(recore)).forEach(System.out::println);

    }

}
