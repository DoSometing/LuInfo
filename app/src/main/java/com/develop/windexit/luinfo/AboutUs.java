package com.develop.windexit.luinfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class AboutUs extends Fragment {

    private ExpandableTextView t1,t2,t3,student;

    private String Mission = "The mission of Leading University (LU) is to provide internationally comparable higher education at reasonable cost in a range of disciplines that are particularly relevant to current and future societal needs in business, science, technology, Arts and social sciences.To attain its mission, LU offers adequate resources, opportunities and expertise to students so that they can achieve their high academic and career goals. As a seat of higher learning and ethical values and norms, Leading University itself is committed to ensure those principles\n";
    private String History = "The establishment of Leading University in Sylhet,a holy place of the country, was indeed a noble idea of a distinguished personality Danobir Dr. Syed Ragib Ali, who is well-known for his philanthropic contributions to educational institutions all over the country. He established many educational institutions at different levels and of different kinds including a medical college-Jalalabad Ragib-Rabeya Medical College and Hospital in Sylhet. Dr. Ragib Ali is a pioneer in establishing the first private university-North-South University in Bangladesh. He was the founder Vice-Chairman of North-South University and the Chairman of The University of Asia Pacific and later on he was the Chairman of North-South University. He placed a proposal for establishing Leading University to the Ministry of Education on the 24th of August 1996 and the Ministry issued permission on the 28th of August 2001. Leading University was inaugurated on the 4th of March, 2002 and it commenced its first trimester on that day. The University at first had an enrollment with 106 students in undergraduate programs that was marked a milestone for the university and reasonably a source of inspiration to the persons those are interested in education. Currently the number of enrolled students of this university is around 5000 which is larger than other private universities in this region. Leading University is playing a leading role in providing rationalized and quality education with the support of more than 200 distinguished faculty members from home and aboard. Leading University possesses two spacious city campuses namely ‘Surma Tower’ and ‘Rangmahal Tower’ having an area of 80,000 square feet located in the heart of Sylhet City where students of different programs are availing the academic services satisfactorily along with laboratory and all co-curricular activities. Moreover, academic activities also started in the permanent campus which is located in a very beautiful and green landscape of more than 5 acres of area at Ragibnagar, Kamalbazar which is at the outskirts of Sylhet City. At present, students of all faculties are availing this opportunity to attend classes in a spacious building of nearly 34,000 square feet along with all supportive facilities. Another multistoried academic building of 88,000 sft. is under construction which will open the door of a new horizon for providing excellent academic services.\n";
    private String Vision = "The dream of Leading University is to develop future leaders through academic excellence, research and social orientation for attaining competitiveness in the global context among the graduates. It promotes to become a center for integrated development by focusing academic, intellectual, creative, technological, practical and humanistic values.\n";

    private String Student = "Leading University Computer Club\n\nLeading University Social Service Club\n\nLeading University Electronics Club " +
            "\n\nLeading University Cultural Club\n\nLeading University Debating Club\n\nLeading University Model United Nation\n\nLeading University BNCC" +
            "\n\nLeading University Sports Club\n\nLeading University Photographic Society\n\nMusical Band: ORPHEUS & BANNED COMMUNITY ";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about_us, container, false);

       /* circleImageView=(CircleImageView)rootView.findViewById(R.id.imgFounder);
        circleImageView.setImageDrawable(R.drawable.founder);*/


        t1= rootView.findViewById(R.id.history);
        t1.setText(History);

        t2 = rootView.findViewById(R.id.mission);
        t2.setText(Mission);

        t3 = rootView.findViewById(R.id.vision);
        t3.setText(Vision);

        student=rootView.findViewById(R.id.student);
        student.setText(Student);

        return rootView;
    }

}

