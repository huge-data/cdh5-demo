package zx.soft.wordcount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	private final Text word = new Text();
	private final static IntWritable NOE = new IntWritable(1);

	@Override
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

		if ((value != null) && (value.toString().length() > 0)) {
			StringTokenizer wordList = new StringTokenizer(value.toString());
			while (wordList.hasMoreTokens()) {
				word.set(wordList.nextToken());
				context.write(word, NOE);
			}
		}

	}

}
