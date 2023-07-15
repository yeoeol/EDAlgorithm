package do_it_java.CollectionFrameWork.collection.hashset;

import do_it_java.CollectionFrameWork.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    private HashSet<Member> hashSet;

    public HashSetTest() {
        this.hashSet = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : hashSet) {
            System.out.println(member);
        }

//        System.out.println(arrayList);
    }
}
