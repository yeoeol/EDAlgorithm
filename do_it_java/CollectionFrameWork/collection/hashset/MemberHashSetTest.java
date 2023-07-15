package do_it_java.CollectionFrameWork.collection.hashset;

import do_it_java.CollectionFrameWork.collection.Member;

public class MemberHashSetTest {

    public static void main(String[] args) {
        HashSetTest memberHashSet = new HashSetTest();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberShin);

        memberHashSet.showAll();
    }
}
