package net.liujian.cheer.LearnStudy.FengzhuangJichengDuotai.KaiPhone;

public class Phone extends KaiPhone3{

	public static void main(String[] args) {
		KaiPhone kai1=new KaiPhone();
		kai1.dadianhua();
		kai1.jiedianhua();
		kai1.xianshi();
		
		
		KaiPhone2 kai2=new KaiPhone2();
		kai2.dadianhua();
		kai2.jiedianhua();
		kai2.fasongduanxin();
		kai2.chakanduanxin();
		kai2.xianshi();
		
		KaiPhone3 kai3=new KaiPhone3();
		kai3.jiedianhua();
		kai3.dadianhua();
		kai3.fasongduanxin();
		kai3.chakanduanxin();
		kai3.naozhong();
		kai3.rili();
		kai3.genghuanlingsheng();
		kai3.xianshi();
		kai3.jisuanqi();
	}

}
