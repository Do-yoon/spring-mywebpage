const webpack = require('webpack');
module.exports = {
	mode: 'development',
	entry: {
		p: '',
	},
	output: {
		path: '',
		filename: '',
		publicPath: '',
	},
	module: {
	},
	plugins: [],
	optimization: {},
	resolve: {
		modules: ['node_modules'],
		extensions: ['.js', '.json', '.jsx', '.css'],
	},
	devServer: {
		contentBase: path.resolve(__dirname, './src'),
		disableHostCheck: true,
		host: "0.0.0.0", // default : 127.0.0.1
	};
};


