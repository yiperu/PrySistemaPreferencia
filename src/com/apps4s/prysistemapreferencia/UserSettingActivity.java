package com.apps4s.prysistemapreferencia;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class UserSettingActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
		//addPreferencesFromResource(R.layout.preference_usersettings);
	}
	
    public static class MyPreferenceFragment extends PreferenceFragment
    {
		@Override
		public void onCreate(final Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.layout.preference_usersettings);
		}
    }
		
}
