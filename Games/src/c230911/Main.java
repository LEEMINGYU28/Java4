package c230911;

import c230911.buffered.BufferedTest;
import c230911.byteStream.OutputStreamTest;
import c230911.dataStream.DataStreamTest;
import c230911.dataStream.ObjectStreamTest;
import c230911.fileIO.FileIOTest;
import c230911.fileIO.SubTest;
import c230911.stream.MatchTest;
import c230911.stream.OptionsTest;

public class Main {

	public static void main(String[]args) {
	MatchTest.test();
	OptionsTest.test();
	OutputStreamTest.test();
	FileIOTest.test();
	SubTest.test();
	BufferedTest.test();
	DataStreamTest.test();
	ObjectStreamTest.test();
	PathTest.test();
	}
}
