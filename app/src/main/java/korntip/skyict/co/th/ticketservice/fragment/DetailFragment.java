package korntip.skyict.co.th.ticketservice.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import korntip.skyict.co.th.ticketservice.R;

public class DetailFragment extends Fragment {

    private String idString, nameUserString;
    private String[] detailStrings;
    private ImageView showPhotoImageView;
    private Uri uri;


    public static DetailFragment detailInstance(String[] detailString) {

        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("Detail", detailString);
        detailFragment.setArguments(bundle);
        return detailFragment;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        GetValue Argument
        detailStrings = getArguments().getStringArray("Detail");

//        Show Text
        showText();

//        Camera Controller
        cameraController();


    }   // Main Method

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == getActivity().RESULT_OK) {

            if (resultCode == 1) {

            }

        }   // if1

    }

    private void cameraController() {
        showPhotoImageView = getView().findViewById(R.id.imvShowPhoto);
        ImageView imageView = getView().findViewById(R.id.imvCamera);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);

            }
        });
    }

    private void showText() {
        TextView docNoTextView = getView().findViewById(R.id.txtDocNo);
        TextView serialTextView = getView().findViewById(R.id.txtSerial);
        TextView detailTextView = getView().findViewById(R.id.txtDetail);
        TextView severityTextView = getView().findViewById(R.id.txtSeverity);
        TextView assignTextView = getView().findViewById(R.id.txtAssign);
        TextView statusTextView = getView().findViewById(R.id.txtStatus);
        TextView dueDateTextView = getView().findViewById(R.id.txtDueDate);

        docNoTextView.setText("DocNo ==> " + detailStrings[0]);
        serialTextView.setText("Serial ==> " + detailStrings[1]);
        detailTextView.setText("Detail ==> " + detailStrings[2]);
        severityTextView.setText("Severity ==> " + detailStrings[3]);
        assignTextView.setText("Assign ==> " + detailStrings[4]);
        statusTextView.setText("Status ==> " + detailStrings[5]);
        dueDateTextView.setText("DueDate ==> " + detailStrings[6]);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;
    }
}
