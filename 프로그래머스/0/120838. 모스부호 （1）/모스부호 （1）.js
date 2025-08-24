function solution(letter) {
    let morse = { 
        '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
        '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
        '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
        '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
        '-.--':'y','--..':'z'
    }

    var answer = '';
    let morseValue= Object.keys(morse);
    let result = letter.split(' ')
     for(let x of result){
         answer+=morse[morseValue.find(e=> e===x)]
     }
     return answer;

}
