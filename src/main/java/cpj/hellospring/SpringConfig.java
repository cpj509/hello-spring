package cpj.hellospring;

import cpj.hellospring.aop.TimeTraceAop;
import cpj.hellospring.repository.JpaMemberRepository;
import cpj.hellospring.repository.MemberRepository;
import cpj.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    /*
    * 기존의 JDBC방식과 JdbcTemplate를 사용할 때에 사용함.
    * */
//    private DataSource dataSource;
//
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    /*
    * JPA를 사용할 때 사용.
    * */
//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    /*
    * Spring Data JPA를 사용할 때 사용.
    * */
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {

//        return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository() {
//
////        return new MemoryMemberRepository();  //메모리에 저장하는 방식(DB 사용 X).
////        return new JdbcMemberRepository(dataSource);  //기존의 Jdbc 방식.
////        return new JdbcTemplateMemberRepository(dataSource);  //JdbcTemplate를 사용하는 방식.
//        return new JpaMemberRepository(em);
//    }
}
